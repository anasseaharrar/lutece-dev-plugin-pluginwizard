/*
 * Copyright (c) 2002-2013, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.pluginwizard.business.model;

import fr.paris.lutece.portal.service.plugin.Plugin;
import fr.paris.lutece.util.ReferenceList;

import java.util.Collection;


/**
* IPluginFeatureDAO Interface
*/
public interface IPluginFeatureDAO
{
    /**
     * Deletes all the features attached to a specified plugin
     * @param nIdPlugin The id of the plugin
     * @param plugin The plugin
     */
    void deleteAllPluginFeaturesByPluginId( int nIdPlugin, Plugin plugin );

    /**
     * Insert a new record in the table.
     * @param pluginFeature instance of the PluginFeature object to inssert
     * @param plugin the Plugin
     */
    void insert( PluginFeature pluginFeature, Plugin plugin );

    /**
     * Add the dependency
     * @param idPlugin The id of the plugin
     * @param idPluginFeature The id of the admin feature
     * @param  plugin the Plugin
     */
    void insertDependency( int idPlugin, int idPluginFeature, Plugin plugin );

    /**
    * Update the record in the table
    * @param pluginFeature the reference of the PluginFeature
    * @param plugin the Plugin
    */
    void store( PluginFeature pluginFeature, Plugin plugin );

    /**
     * Delete a record from the table
     * @param nIdPluginFeature int identifier of the PluginFeature to delete
     * @param plugin the Plugin
     */
    void delete( int nIdPluginFeature, Plugin plugin );

    ///////////////////////////////////////////////////////////////////////////
    // Finders

    /**
     * Load the data from the table
     * @param nKey The identifier of the plugin feature
     * @param plugin the Plugin
     * @return The instance of the pluginFeature
     */
    PluginFeature load( int nKey, Plugin plugin );

    /**
     * Returns a list of features by plugin
     * @param nPluginId The id of the generated plugin
     * @param plugin The plugin
     * @return A collection of features related to the plugin
     */
    Collection<PluginFeature> selectFeatureByPlugin( int nPluginId, Plugin plugin );

    /**
     * Returns the list of admin features associated with the generated plugin
     * @param nPluginId The generated plugin id
     * @param plugin The plugin
     * @return The referencelist of features by plugin
     */
    ReferenceList selectFeatureByPluginCombo( int nPluginId, Plugin plugin );
}
