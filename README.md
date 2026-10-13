# Mini E-Commerce System — Java Console App

A small Java console application demonstrating basic object-oriented programming, product listing, shopping-cart operations, quantity tracking, total calculation, and checkout.

## Features

- View a small in-memory product catalogue.
- Add products to a shopping cart.
- Increase the quantity when the same product is added again.
- View line totals and the cart total.
- Simulate checkout and clear the cart.

## Technology

- Java
- `Scanner` for console input
- `ArrayList` for product and cart collections

This is a command-line practice project. It does not use a database, web frontend, user accounts, or real payment processing. Products and cart contents reset when the program exits.

## Run Locally

Install a JDK, then run these commands from the repository root:

```bash
cd "intern s"
javac *.java
java ECommerceApp
```

The application will print a menu in the terminal. Choose option 5 to exit.

## Source Files

- `ECommerceApp.java` — menu and application entry point
- `Store.java` — sample product catalogue
- `Product.java` — product data and display
- `ShoppingCart.java` — cart operations and total calculation
- `CartItem.java` — product quantity and line total

## Future Improvements

- Handle non-numeric console input without terminating the application.
- Add unit tests and a build tool such as Maven.
- Persist orders and products if the project is expanded beyond a console exercise.

## Repository

[View this project on GitHub](https://github.com/suresh294/ecommerce)
