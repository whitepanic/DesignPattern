package Factory.idcard;

import java.util.ArrayList;
import java.util.List;

import Factory.framework.Factory;
import Factory.framework.Product;

public class IDCardFactory extends Factory{
	
	private List owners = new ArrayList();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	public List getOwners(){
		return owners;
	}

}
