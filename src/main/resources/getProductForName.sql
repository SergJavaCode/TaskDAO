select product_name from netology_task.orders 
	inner join netology_task.customers 
		on netology_task.orders.customer_id = netology_task.customers.id 
			where LOWER(netology_task.customers.name)  = LOWER(:name)