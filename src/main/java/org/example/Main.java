package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        handleItems();
    }

    private static void handleItems() {
        Object item = new Object();
        List<ItemHandler> itemCheckers = initiateItemHandlers();

        for (ItemHandler itemChecker : itemCheckers) {
            if (itemChecker.handleItem(item))
                break;
        }
    }

    private static boolean checkIfItemIsSprayCan(Object item) {
        return false;
    }

    private static List<ItemHandler> initiateItemHandlers() {
        ArrayList<ItemHandler> result = new ArrayList<>();
        result.add(Main::checkIfItemIsSprayCan);

        return result;
    }

    private interface ItemHandler {
        boolean handleItem(Object item);
    }
}