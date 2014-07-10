class WPTClient
{
	def iniciarTeste(url)
	{
		new ValidadorUrl().validar(url)

		def resultado = new CamadaHttp().iniciarTeste(url)

		new ProcessadorDeResultado().processar(resultado)
	}
}

class WPTClient
{
	private CamadaHttp proxy

	WPTClient(proxy)
	{
		this.proxy = proxy
	}

	def iniciarTeste(url)
	{
		new ValidadorUrl().validar(url)

		def resultado = proxy.iniciarTeste(url)

		new ProcessadorDeResultado().processar(resultado)
	}
}

class CamadaHttpTest
{
	def 
}

class CamadaHttp
{
	// ...demais métodos

	def iniciarTeste(url)
	{
		// ...ainda sem a implementação real...
	}
}

