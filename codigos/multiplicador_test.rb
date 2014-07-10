require "test/unit"
require "./multiplicador"

class TestMultiplicador < Test::Unit::TestCase

	def test_multiplicar_por_2()
		multiplicador = Multiplicador.new

		testes = {
			2 => 4, 
			5 => 10,
			10 => 20,
			13 => 26,
			20000 => 40000,
			0 => 0
		}

		testes.each do |numero, dobro|
			resultado = multiplicador.multiplicar(numero)

			assert resultado == dobro
		end
	end

end

