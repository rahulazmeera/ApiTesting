package StoreAPI.StoreAPI;


public class Store_API_Endpoints {

	/***
	 * 
	 * OREDRS API END POINTS  
	 * 
	 * Integration EndPoints
	 * 
	 *******/
	
	public static final String POST_PlaceOrder="https://2824c1o6y8.execute-api.us-west-2.amazonaws.com/int/order";
	public static final String PUT_ItemStatusUpdate="https://2824c1o6y8.execute-api.us-west-2.amazonaws.com/int/order/item/1501601908955/241945-1";
	public static final String PUT_OrderStatusUpdate="https://2824c1o6y8.execute-api.us-west-2.amazonaws.com/int/order/1501599429218";
	public static final String POST_GetOrderBYStroe="https://2824c1o6y8.execute-api.us-west-2.amazonaws.com/int/store/orders/123456";
	
	/****
	 * 
	 * STORE MENU API END POINTS
	 * 
	 * Integration EndPoints
	 * ***/
	public static final String Get_EquipmentDetailsOfStore="https://ttaf0zc5q9.execute-api.us-west-2.amazonaws.com/int/store/35403/equipments";
	public static final String PUT_UpdateEquipmentDetails="https://ttaf0zc5q9.execute-api.us-west-2.amazonaws.com/int/store/35403/equipment/update";
	
	/******
	 * 
	 * JUMIO RESPONSE ID
	 * 
	 * HANDHELD DEVICE(After Scanning The ID Card sends the Response)
	 * 
	 * 
	 *****/
	
	
	
	
	
	
	/*****
	 * 
	 * 
	 * INITIAL SETUP API
	 * 
	 * Store ID and IP Address
	 * 
	 * 
	 */
	
	public static final String Initial_Store_Setup="https://tqzqn1nwtk.execute-api.us-west-2.amazonaws.com/int/store/update";
	
	
	
	
	/*****
	 * 
	 * API Keys   for Store and Store Status
	 * 
	 *********/
	 public static final String Get_orderByStoreKey="UXLTASZbtN65KAI4pitJ54YN9qBYKh9v1LTEGArd"; 
	
	 public static final String MenuAPIKEY="C5LOUktOfx2rveUKyuiha9lygvEcbafndWpMusd8";
	 
	 public static final String Intial_Setup_Key="f2cwhqw7XK8ZPoQBIv9A92Av22IfrbBT9qcriKvd";
	 
	 public static final String Update_Equip_Key="C5LOUktOfx2rveUKyuiha9lygvEcbafndWpMusd8";
	 

}
