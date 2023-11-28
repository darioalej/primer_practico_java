package org.ejercicioBanco.archivos;


import com.opencsv.CSVWriter;
import org.ejercicioBanco.CuentaBancaria;

import java.io.FileWriter;
import java.io.IOException;

public class archivosServiciosImpl implements archivosServicios{

     @Override
     public void exportarProductosACsv(List<Producto> productos, String nombreDeArchivo)  {

          try {
               CSVWriter writer = new CSVWriter(new FileWriter(""));

               String [] encabezado = {"ID", "NOMBRE", "SALDO", "TIPO"};
               writer.writeNext(encabezado);

               for (CuentaBancaria cuenta: cuentas) {
                    String [] datos ={
                           CuentaBancaria.

                    }
               }
          }
          catch (IOException e) {
               System.out.println("Algo salió mal al exportar el archivo");
               throw new RuntimeException(e);
          }

     }
}


     El sistema debe tener una funcionalidad que permite exportar en un csv las cuentas bancarias del  banco. En las columnas del csv se debe ver :

        Número único del titular
        Nombre de titular
        Saldo
        Tipo

        El listado del archivo tiene que estar ordenado por número único del titular y por saldo.
        Recordar que un usuario (Un número único) puede tener varias cuentas.


