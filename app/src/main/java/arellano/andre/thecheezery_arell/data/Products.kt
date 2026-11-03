package arellano.andre.thecheezery_arell.data
import arellano.andre.thecheezery_arell.R
import arellano.andre.thecheezery_arell.data.Product

val coldDrinks = listOf(
    Product("Caramel Frap", 5f, R.drawable.caramel_frap, "Caramel syrup, coffee, milk and ice."),
    Product("Chocolate Frap", 6f, R.drawable.chocolate_frap, "Chocolate, milk and ice."),
    Product("Cold Brew", 3f, R.drawable.coldbrew, "Coffee brewed cold for several hours."),
    Product("Matcha Latte", 4f, R.drawable.matcha, "Matcha tea with creamy milk."),
    Product("Oreo Milkshake", 7f, R.drawable.oreomilkshake, "Ice cream and Oreo cookies."),
    Product("Peanut Milkshake", 7f, R.drawable.peanutmilkshake, "Vanilla ice cream and peanut butter."),
)

val hotDrinks = listOf(
    Product("Latte", 6f, R.drawable.latte, "Espresso and steamed milk."),
    Product("Hot chocolate", 5f, R.drawable.hotchocolate, "Hot chocolate with marshmallows."),
    Product("Espresso", 4f, R.drawable.espresso, "Concentrated coffee."),
    Product("Chai Latte", 6f, R.drawable.chailatte, "Spiced tea with milk."),
    Product("Capuccino", 7f, R.drawable.capuccino, "Espresso with steamed milk foam."),
    Product("American coffee", 2f, R.drawable.americano, "Espresso with hot water."),
)

val sweets = listOf(
    Product("Blueberry cake", 6f, R.drawable.blueberrycake, "Vanilla cake with blueberries."),
    Product("Chocolate cupcake", 3f, R.drawable.chocolatecupcake, "Chocolate cupcake with cream."),
    Product("Lemon tartalette", 4f, R.drawable.lemontartalette, "Lemon pastry tart."),
    Product("Red Velvet cake", 6f, R.drawable.redvelvetcake, "Red velvet cake with cream cheese."),
    Product("Cherry cheesecake", 7f, R.drawable.strawberrycheesecake, "Creamy cheesecake with fruit."),
    Product("Tiramisu", 6f, R.drawable.tiramisu, "Italian coffee-flavored dessert."),
)

val salties = listOf(
    Product("Chicken crepes", 6f, R.drawable.chickencrepes, "Crepes with chicken and mushrooms."),
    Product("Club Sandwich", 5f, R.drawable.clubsandwich, "Sandwich with fries."),
    Product("Panini", 4f, R.drawable.ic_panini, "Grilled Italian sandwich."),
    Product("Philly cheese steak", 6f, R.drawable.phillycheesesteak, "Steak sandwich with peppers and cheese."),
    Product("Nachos", 7f, R.drawable.nachos, "Tortilla chips with cheese and toppings."),
)

val catalog: Map<Category, List<Product>> = mapOf(
    Category.HOT_DRINKS to hotDrinks,
    Category.COLD_DRINKS to coldDrinks,
    Category.SALTIES to salties,
    Category.SWEETS to sweets
)
