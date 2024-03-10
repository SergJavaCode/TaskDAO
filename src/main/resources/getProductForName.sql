select product_name from netology_task.orders 
	inner join netology_task.customers 
		on netology_task.orders.customer_id = netology_task.customers.id 
			where lower(netology_task.customers.name)  = :name