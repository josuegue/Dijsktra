/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DepartmentPackage;

/**
 *
 * @author Josue_Guevara
 */
public class CargarDptos {
    private String datos = "Jutiapa;"
            + "Agua Blanca;"
            + "Atescatempa;"
            + "Comapa;"
            + "Conguaco;"
            + "El Adelanto;"
            + "El Progreso;"
            + "Jalpatagua;"
            + "Jerez;"
            + "Asunción Mita;"
            + "Moyuta;"
            + "Pasaco;"
            + "Quesada;"
            + "San José Acatempa;"
            + "Santa Catarina Mita;"
            + "Yupiltepeque;"
            + "Zapotitlan";
    private String[] dataDpto = datos.split(";");

    public String[] getArray() {
        return this.dataDpto;
    }
}
