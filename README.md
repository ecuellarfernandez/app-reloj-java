# Aplicación de reloj mundial
![imgp-1](https://user-images.githubusercontent.com/60387528/203387895-5d77356d-09b9-479f-8259-00b3c1737342.PNG)
![imgp2](https://user-images.githubusercontent.com/60387528/203388590-72cc4da4-9941-4789-9ead-0f9bf58dfdb0.PNG)


Inicio de ejecución de programa muestra la hora actual de Bolivia, cuenta con el botón añadir que permite editar los relojes que se muestran en pantalla. Además de eso se puede cambiar el tema a oscuro teniendo predeterminado el claro.

- Mostrar hora principal Bolivia
- Añadir hora de país seleccionado
- Eliminar reloj
- Cambiar tema de ventanas

## Librerías utilizadas
Las librerías que utiliza es para añadir nuevas funcionalidades a las ventanas y ayudar con la apariencia

- FlatFlaf: Añadir nuevos look and feel
- Jgoodies: Añadir nuevo layout

## UML
![Uml](https://raw.githubusercontent.com/ecuellarfernandez/app-reloj-java/master/proyecto-final-p2-erick.png)

### Funcionamiento del programa

### Clases

- Inicio
Muestra reloj por defecto
  - Parametros: ArrayList String contiene las zonas de los relojes a crear
  - Metodos: imprimirReloj Puede llamar a otra ventana (VentanaEditarRelojes) para manipular los Reloj
  
- VentanaEditarReloj
  - Parametros: recibe la pantalla anterior para destruirla y que no afecte en el consumo de memoria (.dispose())
  - Metodos: crearNuevoReloj crea una nueva pantalla de inicio con el ArrayList actualizado y elimina la anterior pantalla, cargarRelojes muestra en el comboBox los relojes creados, eliminarReloj crea nueva pantalla Inicio con ArrayList actualizado y elimina la anterior pantalla.

- PanelReloj
  - Parametros: recibe el String para posteriormente mostrarlo en el JLabel y llamar al Reloj para crearlo y añadirlo a su JLabel.
 
- Reloj
  - Parametros: JLabel para actualizar el reloj constantemente en el y String para saber la zona del reloj
  
- Global
- Variables Globales
  

### Ejecución

- Main llama a la clase Inicio la cual recibe de parametro un arrayList el cual contiene String de la zona a crear los relojes
- Inicio tiene el metodo ImprimirRelojes, este llama a PanelReloj que se encarga de crear un nuevo panel para el Reloj a partir del parametro recibido.
- Inicio tiene el metodo para abrir una VentanaEditarRelojes para manipular estos
