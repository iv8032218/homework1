SELECT customers.Name, orders.OrderID, country.Name FROM test_club_task1.customers
JOIN test_club_task1.orders ON customers.CustomerID=orders.CustomerID
JOIN test_club_task1.country ON customers.CountryID=country.ID;