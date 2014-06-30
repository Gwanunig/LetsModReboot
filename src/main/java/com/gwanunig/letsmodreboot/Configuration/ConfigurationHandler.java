package com.gwanunig.letsmodreboot.Configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //Create the config obj from the given config file
        Configuration configuration = new Configuration(configFile);

        try
        {
            //Load the config file
            configuration.load();

            //Read in properties from config file
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true ,"This is an example config value").getBoolean(true);
        }
        catch (Exception e)
        {
            //Log the exception
        }
        finally
        {
            //Save the config file
            configuration.save();
        }

    }

}
