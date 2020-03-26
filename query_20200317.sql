use Northwind;

--select {column(field,item)} from {table} where {condition} order by {type-asc};

--distinct					: delete repeatation
--ex)select distinct country from customers;

--count({column}) as {name}	: count the number of column as name
--ex)select count(*) as distinctcountries from Customers where country='brazil';

--select returns table.
--ex)select country from (select * from Customers where country='mexico')country;

--insert into Customers(CustomerID,CompanyName,ContactName,City,Country)
--values('TESTS','TestCompnay','KimHG','Seoul','Korea');

--select * from Customers order by country asc, ContactName asc;

select * from Customers where Region is not null;