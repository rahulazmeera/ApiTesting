package StoreAPI.StoreAPI;

public class store_API_Request_Body {

	
	
	
	
	
    public static final String GetRequestBody="{\n  \"status\": \"all\"\n}";
	
	public static final String CreateOrderBody="{\n  \"store_id\": \"12345\",\n  \"customer_id\": \"2222227\",\n  \"eta\":\"2017-06-21T20:23:54.150Z\",\n  \"total\": \"25.26\",\n  \"tax\": \"1.25\",\n  \"payment_made\": \"26.51\",\n  \"created\": \"2017-06-21T20:23:54.150Z\",\n  \"created_by\": \"Ramm\",\n  \"last_update\": \"2001-06-21T23:02:54.150Z\",\n  \"last_update_by\": \"Store Employee Nemo\",\n  \"session_id\": \"lit3py55t21z5v55vlm25s55:\",\n  \"order_status\": \"submitted\",\n  \"order_type\": \"pickup\",\n  \"pickup_time\": \"2017-08-10T15:45:54.150Z\",\n  \"notes\": \"please make cold utems very chill, i love chill\",\n  \"items\": [\n    {\n    \"id\":\"100327-1\", \n    \"quantity\": 4,\n    \"item_order\": 1,\n    \"created\": \"2017-06-20T16:44:29.781Z\",\n    \"updated\": \"2017-06-20T16:44:29.781Z\",\n    \"status\":\"pending\",\n    \"notes\": \"Sample Notes\"\n  },{\n    \"id\":\"241945-1\",  \n    \"quantity\": 1,\n    \"item_order\": 1,\n    \"created\": \"2017-06-20T16:44:29.781Z\",\n    \"updated\": \"2017-06-20T16:44:29.781Z\",\n    \"status\":\"pending\",\n    \"notes\": \"Sample Notes\"\n  },{\n    \"id\":\"100355-1\",  \n    \"quantity\": 1,\n    \"item_order\": 1,\n    \"created\": \"2017-06-20T16:44:29.781Z\",\n    \"updated\": \"2017-06-20T16:44:29.781Z\",\n    \"status\":\"pending\",\n    \"notes\": \"Sample Notes\"\n  },{\n    \"id\":\"140578-1\",  \n    \"quantity\": 1,\n    \"item_order\": 1,\n    \"created\": \"2017-06-20T16:44:29.781Z\",\n    \"updated\": \"2017-06-20T16:44:29.781Z\",\n    \"status\":\"pending\",\n    \"notes\": \"Sample Notes\"\n  },{\n    \"id\":\"172906-1\",  \n    \"quantity\": 1,\n    \"item_order\": 1,\n    \"created\": \"2017-06-20T16:44:29.781Z\",\n    \"updated\": \"2017-06-20T16:44:29.781Z\",\n    \"status\":\"pending\",\n    \"notes\": \"Sample Notes\"\n  },{\n    \"id\":\"246630-1\",  \n    \"quantity\": 1,\n    \"item_order\": 1,\n    \"created\": \"2017-06-20T16:44:29.781Z\",\n    \"updated\": \"2017-06-20T16:44:29.781Z\",\n    \"status\":\"pending\",\n    \"notes\": \"Sample Notes\"\n  }\n  ],\n  \"driver_details\": {\n    \"service_name\": \"Uber\",\n    \"name\": \"John\",\n    \"address\": \"1800 Waterview pkwy Apt #543, Plano, TX 75034\",\n    \"proof_of_id\": \"License\",\n    \"service_charge\": \"5\",\n    \"tip\": \"3\"\n  }\n\n}";
	
	public static final String Update_Order_Status_Body="{\n  \"status\":\"ready\"\n}";
	
	public static final String Update_Item_Status_Body="{\n  \"status\":\"complete\"\n}";
	
	
	//Initial Setup Screen Request Body Data
	public static final String Itial_Setup_Body="{\n  \"store_id\" : \"12343\",\n  \"isp_ip\": \"10.200.10.123\"\n}";
	
	
	//Cancel Order Test Request Body
	public static final String Cancel_Order_Body="{\n  \"status\":\"cancelled\",\n  \"reason\":\"Out of Stock\"\n}";
	
	//Updating the Equipment Status
	public static final String Update_Equipment_Status_Body="{\n  \"equipment_name\": \"slurpee\",\n  \"equipment_type\":\"blueberry\",\n  \"equipment_status\": \"1\"\n}";
	
	
	
	
	
}
