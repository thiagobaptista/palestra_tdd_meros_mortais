class WPTClientTest
{
	@Test
	void deve_o_WPTClient_iniciar_um_teste_em_uma_url_valida()
	{
		def client = new WPTClient()

		// ...o resto do método...
	}

	// ...o resto da classe...
}

class WPTClientTest
{
	@Test
	void deve_o_WPTClient_iniciar_um_teste_em_uma_url_valida()
	{
		def client = new WPTClient( new MockCamadaHttp() )

		// ...o resto do método...
	}

	// ...o resto da classe...
}

class WPTClientIntegrationTest
{
	@Test
	void deve_o_WPTClient_iniciar_um_teste_em_uma_url_real()
	{
		def client = new WPTClient( new CamadaHttp() )

		// ...o resto do método...
	}

	// ...o resto da classe...
}

