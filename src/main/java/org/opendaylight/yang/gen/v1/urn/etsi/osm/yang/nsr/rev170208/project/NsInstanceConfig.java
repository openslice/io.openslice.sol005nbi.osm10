package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Project2;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.config.Nsr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.config.NsrKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * container ns-instance-config {
 *   list nsr {
 *     key id;
 *     unique name;
 *     leaf schema-version {
 *       type string;
 *       default v3.0;
 *     }
 *     leaf id {
 *       type yang:uuid;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf short-name {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf admin-status {
 *       type enumeration {
 *         enum ENABLED;
 *         enum DISABLED;
 *       }
 *     }
 *     container nsd {
 *       uses nsd-base:nsd-descriptor-common;
 *       uses project-nsd:nsr-nsd-vld;
 *       uses project-nsd:nsr-nsd-constituent-vnfd;
 *       uses project-nsd:nsr-nsd-placement-groups;
 *       uses project-nsd:nsr-nsd-vnf-dependency;
 *       uses project-nsd:nsr-nsd-monitoring-param;
 *     }
 *     uses ns-instance-config-params;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:etsi:osm:yang:nsr?revision=2017-02-08)ns-instance-config</i>
 * 
 * <p>To create instances of this class use {@link NsInstanceConfigBuilder}.
 * @see NsInstanceConfigBuilder
 *
 */
public interface NsInstanceConfig
    extends
    ChildOf<Project2>,
    Augmentable<NsInstanceConfig>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("ns-instance-config");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.NsInstanceConfig> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.NsInstanceConfig.class;
    }
    
    /**
     * @return <code>java.util.Map</code> <code>nsr</code>, or <code>null</code> if not present
     */
    @Nullable Map<NsrKey, Nsr> getNsr();
    
    /**
     * @return <code>java.util.Map</code> <code>nsr</code>, or an empty list if it is not present
     */
    default @NonNull Map<NsrKey, Nsr> nonnullNsr() {
        return CodeHelpers.nonnull(getNsr());
    }

}

