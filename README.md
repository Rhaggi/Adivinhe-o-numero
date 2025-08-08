# Adivinhe o número
  Mini jogo que fiz para praticar a  minha lógica de programação e o loop for aprendido no curso do Nelio Alves. 
# Passo a passo
  - Pesquisei idéias de projetos que um iniciante na linguagem Java poderia fazer para treinar suas habilidades.
  - Escolhi  forma em que faria (no caso usando o loop for).
  - Comecei a codar, indo aplicando o que eu lembrava e como achei que funcionaria.
  - Comecei a testar e arrumar alguns erros de lógica.
# Aprendizados
  Criando o jogo, pude treinar não somente o loop for mas também a estrutura condicional if e else. Pesquisando melhorias e idéias, conheci a classe Random para gerar o número aleatório para ser adivinhado.
# Erros cometidos
  Na primeira tentativa da criação da lógica, Estava tentando colocar a condicional para testar se as chances tinham acabado dentro do mesmo if/else do loop for, o que me gerava erros do tipo:
    - Não aparecia a mensagem de "Suas chances acabaram" pois essa condicional não era testada visto que o loop também finalizava.
    - Aumentar a quantidade de loops não era viável já que isso também aumentava as tentativas (fazendo a pessoa conseguir jogar mesmo com 0 tentativas restantes).
  A solução que cheguei foi criar uma variável do tipo boolean para checar se a pessoa acertou ou não. Se sim, o loop finaliza com o break e a variavel fica true, interrompendo o jogo. Caso isso não aconteça, a mensagem de fim de jogo é exibida.
# Próximos passos
Quero reescrever esse código com  loop do/while para dar ao jogador a opção de jogar novamente!
