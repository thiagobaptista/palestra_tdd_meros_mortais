class WPTClientTest
{
	@Test
	void deve_o_WPTClient_iniciar_um_teste_em_uma_url_valida()
	{
		def client = new WPTClient()

		def urls = \
			[
				"http://www.americanas.com.br",
				"www.shoptime.com.br",
				"submarino.com.br"
			]

		urls.each { url ->
			client.iniciarTeste(url)
		}
	}

	@Test(expected = IllegalArgumentException)
	void deve_o_WPTClient_nao_iniciar_um_teste_em_uma_url_invalida()
	{
		def client = new WPTClient()

		def urls = \
			[
				"hppt://w$$ww.americanas.com.br",
				"ww. shoptime.co m.br",
				"\\\\ˆ%&%ˆsubmarino.com.br"
			]
		
		urls.each { url ->
			client.iniciarTeste(url)
		}
	}
}

