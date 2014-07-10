class WalkerGameObject
	def change_state(vector)
		if verctor.forward
			@position = @position + vector.position
			@animation = :moving_forward
		elsif vector.backward
			@position = @position - vector.position
			@animation = :moving_backward
		# ...
		# um monte de outros if-elses from hell...
		# ...
		end
	end
end

class WalkerGameObject
	def change_state(vector)
		@state = WalkerState.from vector
	end
end

class WalkerStateTest < Test::Unit::TestCase
	def test_deve_determinar_uma_animacao()
		# ...
		# o WalkerState deve determinar qual animação rodar
		# ...
	end

	def test_deve_determinar_uma_posicao()
		# ...
		# o WalkerState deve determinar a posição no espaço 3D
		# ...
	end

	def test_estado_moving_forward_com_vetor_positivo()
		# ...
		# vetor para frente deve mudar o estado de acordo
		# ...
	end

	# ...
	# ...demais testes...
	# ...
end

