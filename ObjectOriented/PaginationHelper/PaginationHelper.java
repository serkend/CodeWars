package code_wars.ObjectOriented.PaginationHelper;

import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {
    private List<I> collection;
    private int itemsPerPage, pageCount, itemCount;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
        this.itemCount = itemCount();
        this.pageCount = pageCount();
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        itemCount = collection.size();
        return itemCount;
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        pageCount = (int) Math.ceil((float)itemCount / itemsPerPage);
        return pageCount;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex >= pageCount || pageIndex < 0) {
            return -1;
        }
        int lastPageItems = itemsPerPage - (itemsPerPage * pageCount - itemCount);
        if (pageIndex == pageCount - 1) {
            return lastPageItems;
        } else {
            return itemsPerPage;
        }
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if(itemIndex >= itemCount || itemIndex < 0) {
            return -1;
        }
        return itemIndex / itemsPerPage;
    }
}
