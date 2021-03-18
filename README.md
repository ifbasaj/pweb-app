# Programação WEB

Esse modelo de aplicação se conecta ao https://remotemysql.com/. O usuário e senha ja estão no código e o modelo do banco de dados é esse da imagem abaixo:


```plantuml
@startuml

' hide the spot
hide circle

' avoid problems with angled crows feet
skinparam linetype ortho

entity "Produto" as e01 {
  *ID : int <<generated>>
  --
  *NOME : text
  *VALOR : float
  *QUANTIDADE: int
}
@enduml
```

Baixando esse repositório e abrindo no VSCode com o Docker instalado deve funcionar tudo corretamente.
