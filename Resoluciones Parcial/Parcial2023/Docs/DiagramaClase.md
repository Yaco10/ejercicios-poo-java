```mermaid
classDiagram
    class ElementoPresupuesto {
        <<abstract>>
        nombre: int
        +getMateriales()
        +getCantEmpAfectados()
        +getTiempoEstimado()
        +getCosto()
        +getCopia()
    }
    class TareaBasica {
        materiales: List<String>
        costo: double
        cantEmpAfectados: int
        tiempoEstimadoDias: int  
        +getMateriales()
        +getCantEmpAfectados()
        +getTiempoEstimado()
        +getCosto()
        +getCopia() 
        +getLista()
    }

    class TareaBasica {
        especialidades:List<String>
        
        
    }

    class Presupuesto {
        tareas: List<ElementoPresupuesto>
        porcentajeDesc: double
        +getMateriales()
        +getCantEmpAfectados()
        +getTiempoEstimado()
        +getCosto()
        +getCopia()
        +getLista()
    }
    class PresupuestoUrgente {
        +getCosto()
        +getTiempoEstimado()
        +getMateriales()
        +getCantEmpAfectados()
    }

    class PresupuestoAcotado {
        -politica: Filtro;
    }

    class Condicion {
        <<abstract>>
        +cumple(ElementoPresupuesto)
    }
    class CondicionCostoMayor {
        -costo: double
        +cumple(ElementoPresupuesto)
    }
    class CondicionTiempoMayor {
        -tiempo: int
        +cumple(ElementoPresupuesto)
    }
    class CondicionEmpleadosAfectados {
        -empleadosAfectados: int
        +cumple(ElementoPresupuesto)
    }

    Condicion <|-- CondicionCostoMayor
    Condicion <|-- CondicionTiempoMayor
    Condicion <|-- CondicionEmpleadosAfectados

    ElementoPresupuesto <|-- TareaBasica
    ElementoPresupuesto <|-- Presupuesto
    Presupuesto <|-- PresupuestoUrgente
    Presupuesto <|-- PresupuestoAcotado

