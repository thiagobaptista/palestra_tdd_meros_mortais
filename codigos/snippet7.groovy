class RespostaTest
{
	@Test
	void deve_ter_statusText_Ok_com_statusCode_200()
	{
		// ...preparação do teste...

		assert resposta.statusCode == 200
		assert resposta.statusText == "Ok"
	}

	@Test
	void deve_ter_statusText_TestStarted_com_statusCode_100()
	{
		// ...preparação do teste...

		assert resposta.statusCode == 100
		assert resposta.statusText == "Test Started"
	}

	// ...demais testes...
}

class Resposta
{
	// ...demais métodos...

	def statusText()
	{
		// ...preparações e verificações...

		if (statusCode == 200)
		{
			return "Ok"
		}
		else if (statusCode == 100)
		{
			return "Test Started"
		}
		// ...uma penca de outros if-elses...
	}
}

