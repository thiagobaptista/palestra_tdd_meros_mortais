public class ProductParser
{
	public void parseProduct(Product product)
	{
		if (product == null)
			return;

		ProductProperties pp = product.getNotNullProperties();
		DataSourceConnection.fromFileSistemSettings("../settings/").filter(pp);

		product.replaceProperties(pp);
	}
}

