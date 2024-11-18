package oop.practice1.day3;

import oop.practice1.day1.Display;
import java.util.ArrayList;
import java.util.List;

public class Assistant {
    private String assistantName;
    private List<Display> assignedDisplays;

    public Assistant(String assistantName) {
        this.assistantName = assistantName;
        this.assignedDisplays = new ArrayList<>();
    }

    public void assignDisplay(Display d) {
        assignedDisplays.add(d);
    }

    public void assist(){
        System.out.println("Assisting with displays for: " + assistantName);

        if (assignedDisplays.size() < 2){
            System.out.println("Not enough displays to compare.");
        }

        for (int i = 0; i < assignedDisplays.size(); i++) {
            for (int j = i + 1; j < assignedDisplays.size(); j++) {
                Display current = assignedDisplays.get(i);
                Display next = assignedDisplays.get(j);
                current.compareWithMonitor(next);
            }
        }
    }

    public Display buyDisplay(Display d) {
        if (assignedDisplays.remove(d)){
            System.out.println("The display has been purchased and removed from the list.");
            return d;
        } else {
            System.out.println("The display is not available.");
            return null;
        }
    }

}
