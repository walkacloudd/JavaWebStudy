package cn.e3mall.cart.service;

import java.util.List;

import cn.e3mall.common.utils.E3Result;
import cn.e3mall.pojo.TbItem;

public interface CartService {
	
	public E3Result addCart(long userId, long itemId, int num);
	public E3Result mergeCart(long userId, List<TbItem> itemList);
	public List<TbItem> getCartList(long userId);
	public E3Result updateCartItemNum(long userId, long itemId, int num);
	public E3Result deleteCartItem(long userId, long itemId);
	public E3Result clearCartItem(long userId);
}
