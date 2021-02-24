package test;

public class VeryComplexService {
	private SortAlgorithm sortAlgorithm;
	
	public VeryComplexService (SortAlgorithm sortAlgorithm ) {
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public void complexBusiness(int array[]) {
		sortAlgorithm.sort(array);
	}
	
	public static void main(String[] args) {
		SortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		SortAlgorithm quickSortAlgorithm = new QuicksortAlgorithm();
		
		VeryComplexService business1 = new VeryComplexService(bubbleSortAlgorithm);
		VeryComplexService business2 = new VeryComplexService(quickSortAlgorithm);
		
		business1.complexBusiness(null);
		business2.complexBusiness(null);
	}
}
