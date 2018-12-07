package week5reflection;

import exercise6.Furniture;
import exercise6.Step;

public class AddLeg implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("leg");
    }

}
