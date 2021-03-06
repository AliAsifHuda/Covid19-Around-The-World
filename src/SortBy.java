import javafx.collections.ObservableList;

/**
* This is the interface used to specify different
* sorting algorithms for the "Sort By" combo box in
* the BoroughInfo's properties detail output
*/


public interface SortBy {
    
    /**
    * Takes in an ObservableList and returns a sorted list of it
    * @param unsortedList The list which is to be sorted
    * @param isAscendingOrder True if the list is to be ordered in ascending order. False otherwise
    * @return The sorted list (by specific sorting types)
    */
    public ObservableList<CovidStats> sortList(ObservableList<CovidStats> unsortedList, boolean isAscendingOrder);
    
}
