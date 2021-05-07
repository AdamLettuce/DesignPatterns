package designpatterns.compositeComponent;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;


public class Menu {

    private static final String MAIN_MENU = "Menu Główne";
    private static final String PRINTS = "Wydruki";
    private static final String ACTIVITIES = "Aktywności";
    private static final String ISSUES = "Sprawy";
    private static final String INFORMATION = "Informacje";
    private static final String AWAITING_LIST = "Lista oczekujących";
    private static final String MY = "Moje";
    private static final String ADMINISTRATION = "Administracja";
    private static final String CHANGE_PASSWORD = "Zmień hasło";

    public static MenuComponent buildMainMenu() {
        MenuComponent result = buildMenuWithElements(MAIN_MENU, Arrays.asList(PRINTS, INFORMATION));
        result.add(buildMenuWithElements(ACTIVITIES, Arrays.asList(AWAITING_LIST, MY)));
        result.add(buildMenuWithElements(ISSUES, Arrays.asList(AWAITING_LIST, MY)));
        return result;
    }

    public static MenuComponent buildAdminMenu() {
        return buildMenuWithElements(ADMINISTRATION, Arrays.asList(CHANGE_PASSWORD));
    }

    private static MenuComponent buildMenuWithElements(String parent, List<String> children) {
        MenuComponent result = MenuComposite.newInstance(StringUtils.EMPTY);
        if(StringUtils.isNotBlank(parent)) {
            result = MenuComposite.newInstance(parent);
            if(CollectionUtils.isNotEmpty(children)) {
                for(String child: children) {
                    result.add(MenuLeaf.newInstance(child));
                }
            }
        }
        return result;
    }
}
