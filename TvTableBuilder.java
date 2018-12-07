package week5reflection;

import exercise6.AddShelf;
import exercise6.AddTop;
import exercise6.Step;

import java.util.Arrays;
import java.util.List;

public class TvTableBuilder {

    private Step leg = new AddLeg();
    private Step shelf = new AddShelf();
    private Step top = new AddTop();

    List<Step> steps = Arrays.asList(leg, leg, leg, leg, shelf, top);

    public TvTable build() {

        TvTable tvTable = new TvTable();
        for (Step step : steps) {
            step.perform(tvTable);
        }

        return tvTable;
    }

}
