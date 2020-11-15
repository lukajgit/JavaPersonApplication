/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package silab.sd.personapp.utils;

/**
 *
 * @author lukaj
 */
public class Utils {
    private static PersonConfiguration personConfiguration = new PersonConfiguration();

    public static PersonConfiguration getPersonConfiguration() {
        return personConfiguration;
    }

    public static void setPersonConfiguration(PersonConfiguration personConfiguration) {
        Utils.personConfiguration = personConfiguration;
    }

}
