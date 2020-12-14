MERGE INTO `role` VALUES (1,'USER');

merge into `product` values 
	(1, 
	'The Bike Guys', 
	'A sleek chrome design perfect for urban exploration.',
	'https://images.unsplash.com/photo-1545565319-e1b6be69a9a2?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2550&q=80',
	'The Bike 1',
	300,
	10);
merge into `product` values 
	(2, 
	'The Bike Guys', 
	'A light frame and tough design just right for easy offroading.',
	'https://images.unsplash.com/photo-1575585269294-7d28dd912db8?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80',
	'The Bike 2',
	350,
	18);
merge into `product` values 
	(3, 
	'Biking Dudes', 
	'A simple design that's perfect for both seasoned off-roaders and beginners alike.',
	'https://images.unsplash.com/photo-1597600175385-3d3d3df0e63a?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=2509&q=80',
	'The Bike 3',
	250,
	11);
merge into `product` values 
	(4, 
	'Biking Dudes', 
	'Patented bend-not-break technology that can handle even the roughest of trails.',
	'https://images.unsplash.com/photo-1599011711123-87b2959bc8a3?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1491&q=80',
	'The Bike 4',
	500,
	5);
--USER_ID  	BRAND  	DESCRIPTION  	IMAGE_URL  	NAME  	PRICE  	QUANTITY 