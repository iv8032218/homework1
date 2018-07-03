SELECT customers.Name, orders.Status FROM test_club_task1.customers
JOIN test_club_task1.orders ON customers.CustomerID=orders.CustomerID;