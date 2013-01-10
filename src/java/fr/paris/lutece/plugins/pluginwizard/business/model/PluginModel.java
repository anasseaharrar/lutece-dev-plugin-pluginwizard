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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;


/**
 * This is the business class for the object PluginModel
 */
public class PluginModel
{
    // Variables declarations 
    private int _nIdPlugin;
    private String _strPluginName;
    private String _strPluginClass;
    private String _strPluginDescription;
    private String _strPluginDocumentation;
    private String _strPluginInstallation;
    private String _strPluginChanges;
    private String _strPluginUserGuide;
    private String _strPluginVersion;
    private String _strPluginCopyright;
    private String _strPluginIconUrl;
    private String _strPluginProvider;
    private String _strPluginProviderUrl;
    private String _strPluginDbPoolRequired;
    private Locale _locale;
    private Collection<PluginApplication> _listPluginApplications;
    private Collection<PluginFeature> _listPluginFeatures;
    private Collection<PluginPortlet> _listPluginPortlets;

    /**
     * Returns the IdPlugin
     * @return The IdPlugin
     */
    public int getIdPlugin(  )
    {
        return _nIdPlugin;
    }

    /**
     * Sets the IdPlugin
     * @param nIdPlugin The IdPlugin
     */
    public void setIdPlugin( int nIdPlugin )
    {
        _nIdPlugin = nIdPlugin;
    }

    /**
     * Returns the PluginName
     * @return The PluginName
     */
    public String getPluginName(  )
    {
        return _strPluginName;
    }

    /**
     * Sets the PluginName
     * @param strPluginName The PluginName
     */
    public void setPluginName( String strPluginName )
    {
        _strPluginName = strPluginName;
    }

    /**
     * Returns the PluginClass
     * @return The PluginClass
     */
    public String getPluginClass(  )
    {
        return _strPluginClass;
    }

    /**
     * Sets the PluginClass
     * @param strPluginClass The PluginClass
     */
    public void setPluginClass( String strPluginClass )
    {
        _strPluginClass = strPluginClass;
    }

    /**
     * Returns the PluginDescription
     * @return The PluginDescription
     */
    public String getPluginDescription(  )
    {
        return _strPluginDescription;
    }

    /**
     * Sets the PluginDescription
     * @param strPluginDescription The PluginDescription
     */
    public void setPluginDescription( String strPluginDescription )
    {
        _strPluginDescription = strPluginDescription;
    }

    /**
     * Returns the PluginDocumentation
     * @return The PluginDocumentation
     */
    public String getPluginDocumentation(  )
    {
        return _strPluginDocumentation;
    }

    /**
     * Sets the PluginDocumentation
     * @param strPluginDocumentation The PluginDocumentation
     */
    public void setPluginDocumentation( String strPluginDocumentation )
    {
        _strPluginDocumentation = strPluginDocumentation;
    }

    /**
     * Returns the PluginInstallation
     * @return The PluginInstallation
     */
    public String getPluginInstallation(  )
    {
        return _strPluginInstallation;
    }

    /**
     * Sets the PluginInstallation
     * @param strPluginInstallation The PluginInstallation
     */
    public void setPluginInstallation( String strPluginInstallation )
    {
        _strPluginInstallation = strPluginInstallation;
    }

    /**
     * Returns the PluginChanges
     * @return The PluginChanges
     */
    public String getPluginChanges(  )
    {
        return _strPluginChanges;
    }

    /**
     * Sets the PluginChanges
     * @param strPluginChanges The PluginChanges
     */
    public void setPluginChanges( String strPluginChanges )
    {
        _strPluginChanges = strPluginChanges;
    }

    /**
     * Returns the PluginUserGuide
     * @return The PluginUserGuide
     */
    public String getPluginUserGuide(  )
    {
        return _strPluginUserGuide;
    }

    /**
     * Sets the PluginUserGuide
     * @param strPluginUserGuide The PluginUserGuide
     */
    public void setPluginUserGuide( String strPluginUserGuide )
    {
        _strPluginUserGuide = strPluginUserGuide;
    }

    /**
     * Returns the PluginVersion
     * @return The PluginVersion
     */
    public String getPluginVersion(  )
    {
        return _strPluginVersion;
    }

    /**
     * Sets the PluginVersion
     * @param strPluginVersion The PluginVersion
     */
    public void setPluginVersion( String strPluginVersion )
    {
        _strPluginVersion = strPluginVersion;
    }

    /**
     * Returns the PluginCopyright
     * @return The PluginCopyright
     */
    public String getPluginCopyright(  )
    {
        return _strPluginCopyright;
    }

    /**
     * Sets the PluginCopyright
     * @param strPluginCopyright The PluginCopyright
     */
    public void setPluginCopyright( String strPluginCopyright )
    {
        _strPluginCopyright = strPluginCopyright;
    }

    /**
     * Returns the PluginIconUrl
     * @return The PluginIconUrl
     */
    public String getPluginIconUrl(  )
    {
        return _strPluginIconUrl;
    }

    /**
     * Sets the PluginIconUrl
     * @param strPluginIconUrl The PluginIconUrl
     */
    public void setPluginIconUrl( String strPluginIconUrl )
    {
        _strPluginIconUrl = strPluginIconUrl;
    }

    /**
     * Returns the PluginProvider
     * @return The PluginProvider
     */
    public String getPluginProvider(  )
    {
        return _strPluginProvider;
    }

    /**
     * Sets the PluginProvider
     * @param strPluginProvider The PluginProvider
     */
    public void setPluginProvider( String strPluginProvider )
    {
        _strPluginProvider = strPluginProvider;
    }

    /**
     * Returns the PluginProviderUrl
     * @return The PluginProviderUrl
     */
    public String getPluginProviderUrl(  )
    {
        return _strPluginProviderUrl;
    }

    /**
     * Sets the PluginProviderUrl
     * @param strPluginProviderUrl The PluginProviderUrl
     */
    public void setPluginProviderUrl( String strPluginProviderUrl )
    {
        _strPluginProviderUrl = strPluginProviderUrl;
    }

    /**
     * Returns the PluginDbPoolRequired
     * @return The PluginDbPoolRequired
     */
    public String getPluginDbPoolRequired(  )
    {
        return _strPluginDbPoolRequired;
    }

    /**
     * Sets the PluginDbPoolRequired
     * @param strPluginDbPoolRequired The PluginDbPoolRequired
     */
    public void setPluginDbPoolRequired( String strPluginDbPoolRequired )
    {
        _strPluginDbPoolRequired = strPluginDbPoolRequired;
    }

    /**
     * Gets the locale of the plugin
     * @return The Locale
     */
    public Locale getLocale(  )
    {
        return _locale;
    }

    /**
     * Sets the list of plugin applications
     * @param listPluginApplications The list of plugin applications
     */
    public void setPluginApplications( Collection<PluginApplication> listPluginApplications )
    {
        _listPluginApplications = listPluginApplications;
    }

    /**
     * Returns the list of plugin applications
     * @return The collection of applications
     */
    public Collection<PluginApplication> getPluginApplications(  )
    {
        return _listPluginApplications;
    }

    /**
     *  Sets the list of plugin features
     * @param listPluginFeatures The list of plugi features
     */
    public void setPluginFeatures( Collection<PluginFeature> listPluginFeatures )
    {
        _listPluginFeatures = listPluginFeatures;
    }

    /**
     * Returns the list of plugin features
     * @return The plugin features
     */
    public Collection<PluginFeature> getPluginFeatures(  )
    {
        return _listPluginFeatures;
    }

    /**
     * Sets the list of plugin portlets
     * @param listPluginPortlets The list of plugin portlets
     */
    public void setPluginPortlets( Collection<PluginPortlet> listPluginPortlets )
    {
        _listPluginPortlets = listPluginPortlets;
    }

    /**
     *  Returns the list of plugin portlets
     * @return The list of portlets
     */
    public Collection<PluginPortlet> getPluginPortlets(  )
    {
        return _listPluginPortlets;
    }

    /**
     * Returns the list of business classes attached to the generated plugin
     * @return The list of business classes
     */
    public List<BusinessClass> getBusinessClasses(  )
    {
        List listBusinessClasses = new ArrayList<BusinessClass>(  );

        for ( PluginFeature feature : _listPluginFeatures )
        {
            listBusinessClasses.addAll( feature.getBusinessClasses(  ) );
        }

        return listBusinessClasses;
    }

    /////////////////////////////////////////////////////////////
    /**
     * Returns the Plugin Name in Upper case
     * @return The Plugin Name
     */
    public String getPluginNameUpperCase(  )
    {
        return _strPluginName.toUpperCase(  );
    }

    /**
     * Returns the BusinessClass
     * @return The BusinessClass
     */
    public String getPluginNameLowerCase(  )
    {
        return _strPluginName.toLowerCase(  );
    }

    /**
     * Returns the BusinessClass
     * @return The BusinessClass
     */
    public String getPluginNameCapsFirst(  )
    {
        char[] characters = _strPluginName.toCharArray(  );
        characters[0] = Character.toTitleCase( characters[0] );

        return String.valueOf( characters );
    }

    //////////////////////////////////////////////////////////////
    /**
     * Returns the BusinessClass
     * @return The BusinessClass
     */
    public String getNameJspBeanPrefix(  )
    {
        return getPluginNameCapsFirst(  );
    }

    /**
     * Returns the BusinessClass
     * @return The BusinessClass
     */
    public String getNameRightSuffixDeclaration(  )
    {
        return getPluginNameUpperCase(  );
    }

    /**
     * Returns the BusinessClass
     * @return The BusinessClass
     */
    public String getNameRightSuffix(  )
    {
        return getPluginNameUpperCase(  );
    }

    /**
     * Returns the BusinessClass
     * @return The BusinessClass
     */
    public String getNameMainTemplate(  )
    {
        return getPluginNameUpperCase(  );
    }
}
