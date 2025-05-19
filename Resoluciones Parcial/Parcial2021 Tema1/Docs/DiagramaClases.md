```mermaid
classDiagram
    class ElementoVenta {
        +string nombre
        +getPrecio(): double
        +void:getPeso(): double
        +getVolumen; int
        +getMarca(): String
        +getCaracteristicas(): List<String>
        +getCopia(): ElementoVenta
    }

    class Producto{
        -peso: double
        -precio: double
        -volumen: int
        -marca: String
        -caractersiticas: List<String>
        +getPrecio(): double
        +void:getPeso(): double
        +getVolumen; int
        +getMarca(): String
        +getCaracteristicas():List<String>
        +getCopia(): ElementoVenta
    }
    
    class Combo{
        -productos: List<ElementoVenta>
        +getPrecio(): double
        +void:getPeso(): double
        +getVolumen; int
        +getMarca(): String
        +getCaracteristicas():List<String>
        +getCopia(): ElementoVenta
    }

    class ServicioEnvios {
        -politica: Condicion
        +envioGratuito(): bool
    }

    class Condicion{
        <<abstract>>
        +cumpleCon(ElementoVentas): boolean
    }

    
    class CondicionNombre{
        -nombre: String;
        +cumpleCon(ElementoVentas): boolean
    }

    
    class CondicionPrecioMenor{
        -precio: double
        +cumpleCon(ElementoVentas): boolean
    }

    class CondicionCaracteristica{
        -caracteristica: String
        +cumpleCon(ElementoVentas): boolean
    }

     class CondicionVolumanMenor{
        -volumen: int
        +cumpleCon(ElementoVentas): boolean
    }

     class CondicionAND{
        -c1,c2: Condicion
        +cumpleCon(ElementoVentas): boolean
    }

    class CondicionOR{
        -c1,c2: Condicion
        +cumpleCon(ElementoVentas): boolean
    }

    class CondicionNOT{
        -c1: Condicion
        +cumpleCon(ElementoVentas): boolean
    }