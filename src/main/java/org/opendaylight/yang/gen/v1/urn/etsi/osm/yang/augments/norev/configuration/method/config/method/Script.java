package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.ConfigMethod;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Use custom script for configuring the VNF or VDU. This script is executed in 
 * context of Orchestrator (The same system and environment as the Launchpad).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * case script {
 *   container script {
 *     leaf script-type {
 *       type enumeration {
 *         enum rift;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/configuration-method/config-method/script</i>
 *
 */
public interface Script
    extends
    DataObject,
    Augmentable<Script>,
    ConfigMethod
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("script");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.Script> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.Script.class;
    }
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.script.Script</code> <code>script</code>, or <code>null</code> if not present
     */
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.configuration.method.config.method.script.@Nullable Script getScript();

}

