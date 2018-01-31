package StoreAPI.StoreAPI;

import java.io.IOException;

import org.testng.annotations.Test;


public class store_Api_Test {

	
	//1. Get Order By Store API
	@Test
	public static void Get_OrdersFrom_Store() throws IOException{
		
		String type="POST";
		
		apiRequestMethods.POST_Request(Store_API_Endpoints.POST_GetOrderBYStroe, Store_API_Endpoints.Get_orderByStoreKey , store_API_Request_Body.GetRequestBody, type, "Get_all_Orders" );
			
		
		
	}
	
	
	//2. Create Order API
	@Test
	public static void CreateOrder() throws IOException{
		
		String type="POST";
		
		apiRequestMethods.POST_Request(Store_API_Endpoints.POST_PlaceOrder, Store_API_Endpoints.Get_orderByStoreKey, store_API_Request_Body.CreateOrderBody, type, "Create_Orders");
	}
	
	
	//3. Update Order Status
	@Test
	public static void Update_Order_Status() throws IOException{
		
		String type="PUT";
		
		apiRequestMethods.POST_Request(Store_API_Endpoints.PUT_OrderStatusUpdate, Store_API_Endpoints.Get_orderByStoreKey, store_API_Request_Body.Update_Order_Status_Body, type, "Update_Order_Status");
		
	}
	
	
	//4. Update Item Status 
	@Test
	public static void Update_Item_Status() throws IOException{
		String type="PUT";
		
		apiRequestMethods.POST_Request(Store_API_Endpoints.PUT_ItemStatusUpdate, Store_API_Endpoints.Get_orderByStoreKey, store_API_Request_Body.Update_Item_Status_Body, type, "Update_Item_Status");
		
	}
	
	
	//5. Order Cancellation Test
	@Test
	public static void Cancellation_Of_Order() throws IOException{
		
		
        String type="PUT";
		
		apiRequestMethods.POST_Request(Store_API_Endpoints.PUT_OrderStatusUpdate, Store_API_Endpoints.Get_orderByStoreKey, store_API_Request_Body.Cancel_Order_Body, type, "Update_Order_Status");
	}
	
	
	//6. Get Equipment Details From The Store
	
	@Test
	public static void Get_EquipmentDetails() throws IOException{
		
		String type="GET";
		
		apiRequestMethods.getRequest(Store_API_Endpoints.Get_EquipmentDetailsOfStore, Store_API_Endpoints.MenuAPIKEY, type, "Get_EquipMent_Details");
		
		
		
		
	}
	
	
	
	// 7.Initial_Setup of the App
	@Test
	public static void Intial_Setup_Api() throws IOException{
		String type="POST";
		
		apiRequestMethods.POST_Request(Store_API_Endpoints.Initial_Store_Setup, Store_API_Endpoints.Intial_Setup_Key, store_API_Request_Body.Itial_Setup_Body, type, "Initial_Setup_Screen_Of_Store");
		
	}
	
	
	//8.Update Equipment Status
	@Test
	public static void Update_Equipment_Status() throws IOException{
        String type="PUT";
		
		apiRequestMethods.POST_Request(Store_API_Endpoints.PUT_UpdateEquipmentDetails, Store_API_Endpoints.Update_Equip_Key, store_API_Request_Body.Update_Equipment_Status_Body, type, "Update_Equipment_Status");
		
	}
	
	
	
	
	
	
}
