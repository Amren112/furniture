package com.neusoft.service;
import com.neusoft.base.BaseService;
import com.neusoft.po.*;
import java.util.*;

import com.neusoft.po.*;
import com.neusoft.mapper.*;
import com.neusoft.service.*;


public interface ItemOrderService extends BaseService<ItemOrder>{
	
	List<Map<String, Object>> getItemUserNumList();

}
