package StoreAPI.StoreAPI;

import java.io.IOException;

import org.testng.annotations.Test;

public class API_Load_Test {
	
	
	
	

	@Test(priority=1,invocationCount = 10000,threadPoolSize = 1000)
	public static void Get_OrdersFrom_Store() throws IOException{
		
		String type="POST";
		
		apiRequestMethods.POST_Request(Store_API_Endpoints.POST_GetOrderBYStroe, Store_API_Endpoints.Get_orderByStoreKey , store_API_Request_Body.GetRequestBody, type, "Get_all_Orders" );
			
		
		
	}
	
	
	@Test(priority=2,invocationCount = 10000,threadPoolSize = 1000)
	public static void CreateOrder() throws IOException{
		
		String type="POST";
		
		apiRequestMethods.POST_Request(Store_API_Endpoints.POST_PlaceOrder, Store_API_Endpoints.Get_orderByStoreKey, store_API_Request_Body.CreateOrderBody, type, "Create_Orders");
	}
	
	@Test(priority=3,invocationCount = 10000,threadPoolSize = 1000)
	public static void Update_Order_Status() throws IOException{
		
		String type="PUT";
		
		apiRequestMethods.POST_Request(Store_API_Endpoints.PUT_OrderStatusUpdate, Store_API_Endpoints.Get_orderByStoreKey, store_API_Request_Body.Update_Order_Status_Body, type, "Update_Order_Status");
		
	}
	
	
	@Test(priority=4,invocationCount = 10000,threadPoolSize = 1000)
	public static void Update_Item_Status() throws IOException{
		String type="PUT";
		
		apiRequestMethods.POST_Request(Store_API_Endpoints.PUT_ItemStatusUpdate, Store_API_Endpoints.Get_orderByStoreKey, store_API_Request_Body.Update_Item_Status_Body, type, "Update_Item_Status");
		
	}
	
	
	@Test(priority=5,invocationCount = 10000,threadPoolSize = 1000)
	public static void Get_EquipmentDetails() throws IOException{
		
		String type="GET";
		
		apiRequestMethods.getRequest(Store_API_Endpoints.Get_EquipmentDetailsOfStore, Store_API_Endpoints.MenuAPIKEY, type, "Get_EquipMent_Details");
		
	}
	
	
	
	
	
	

}
 