Task 4
Create your own class to describe the order.
The class must contain the order id and order cost fields, which are required fields.
Other fields are possible if necessary.
Create multiple orders and place them in a collection.
Display the collection on the screen.
Sort the orders and display the sorted collection on the screen.
Orders are sorted by price in ascending order.
To sort orders, you should create your own comparator (see the example from the lesson).


Task 5
Create a class to describe the client.
Add fields to the class to describe the client (registration date, name, age, and other fields at your discretion).
The client class should contain a collection field with orders from this client - this is, in a way, a basket of customer orders.
The order class must create fields for describing the order (price, description and other fields are possible).
Create multiple clients.
Create several orders for each customer and place them in the collection field for orders.
Create a collection of the Ida type and fill it with pairs "customer passport number" -> "customer class object".
Passport numbers can be stored as constants in the interface created for this purpose.
Cycle through the collection and display it on the screen:
- all key-value pairs, using Map.Entry<K, V> entry : map.entrySet()
- all key-value pairs, using iterator
- all keys using map.keySet()
- all values using map.values()
