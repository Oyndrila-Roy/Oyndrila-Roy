Hello,

This is the solution to the first sales tax question.

How to Run
Load the .java files into your favorite IDE and run the main method found in the Print class.
Make sure that the input txt files are the root of the project directory. 

Input Files:
t1.txt
t2.txt
t3.txt

Here is a overview of the program

Print Class

	main()
	
Items Class

	String name
	float price
	ItemType type
	
	Items()
	toString()
	getPrice()
	setPrice()
	getName()
	setName()
	ExemptTaxable()
	ImportTaxable()
	
  Receipt Class

	ArrayList<Product> productsList
	double total
	double taxtotal

	Receipt()
	calculateTotals()
	setTotal()
	getTotal()
	setSalesTaxTotal()
	getSalesTaxTotal()
	containsItemFromArray()
	round()
	roundTwoDecimals()
	printReceipt()

  
enum ItemType

	BOOK
	MEDICAL
	FOOD
	OTHERS
	IMPORTED_BOOK
	IMPORTED_MEDICAL
	IMPORTED_FOOD
	IMPORTED_OTHERS
	Exempt
	Import
	
	ItemType()
	Import()
	Exempt()
