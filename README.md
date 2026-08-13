Passar pro GitHub (Pela primeira vez):

Abre o terminal -> git init (isso cria o .git na pasta do projeto, que é oculto)
Clica no Commit (ícone novo) -> Abre o terminal -> git add . (envia os arquivos para uma espécie de backup local (stage área) no computador antes de enviar pra nuvem; você da check em cada arquivo que quer enviar ou so seleciona tudo)
Abre o GitHub -> conecta ele no Android Studio -> New Repository
Abre o terminal (de volta pro Android Studio / qualquer ferramenta) -> git commit -m "texto"
No terminal dnv -> git branch -M main (esse main é o nome da branch, essa branch vai receber o código)
terminal... -> git remote add origin (link) (Esse comando vai pegar os arquivos que estão no git local e vai configurar para mandar eles para esse link que você colocou
git remote -v (checa se esta configurado)
git push -u origin main (origin é a url que voce enviou pra ele logo em cima) (envia pra branch main)
