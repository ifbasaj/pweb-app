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
![ER](http://www.plantuml.com/plantuml/png/7Oz1IyD058JlxrSClGX2GQzIIWFfeQ2jYdfVizDcSRDlsNsr5l6_c-JupJSCpAQQAtOUeiWD-k09wucQrMIcBfGkSfBkMuD7BlePELHSWlLmwHJfqHMzL1n9a_eLKdR53OWXqQwPq6AzYZ1Pi2iMpqNzsNG1Ly6xU_mASBjhyO2G3AlLYOd56VrwBS1oEUdzuMax5em_Dk57ytXu7VaOrSt1otkpVzkrJRkTL-HFDan-VFKF)

Baixando esse repositório e abrindo no VSCode com o Docker instalado deve funcionar tudo corretamente.
