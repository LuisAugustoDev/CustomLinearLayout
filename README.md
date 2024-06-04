# CustomLinearLayout

Este documento se trata de um custom linear layout minimalista fácil de utilzar e feito para aplicações Android.

![Java](https://img.shields.io/badge/language-Java-blue.svg)

## Descrição

CustomLinearLayout é um layout personalizado em Java para Android que permite criar layouts flexíveis e reutilizáveis.

## Amostra em celulares android
![Amostra](https://github.com/LuisAugustoDev/CustomLinearLayout/assets/165170454/bf3cc4a6-7ae7-4d5b-96b8-6b77979e7901)

## Atributos
| Descrição              | XML |
|-----------------------------|-----------------------|
| Alterar cor de destaque | app:accentColor |
| Alterar cor de fundo | app:backgroundColor   |
| Alterar arredondamento     | app:cornerRadius       |

## Exemplo de utilização

```xml
<com.guty.minimalistlinear.MinimalistLinear
     android:layout_height="wrap_content"
     android:layout_width="match_parent"
     android:layout_margin="20dp"
     android:layout_gravity="center"
     android:orientation="horizontal">
```