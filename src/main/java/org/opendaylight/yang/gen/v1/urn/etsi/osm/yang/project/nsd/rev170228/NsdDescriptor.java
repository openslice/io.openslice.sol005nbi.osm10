package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * grouping nsd-descriptor {
 *   uses nsd-base:nsd-descriptor-common;
 *   uses nsd-vld;
 *   uses nsd-constituent-vnfd;
 *   uses nsd-placement-groups;
 *   uses nsd-vnf-dependency;
 *   uses nsd-monitoring-param;
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-descriptor</i>
 *
 */
public interface NsdDescriptor
    extends
    DataObject,
    NsdDescriptorCommon,
    NsdVld,
    NsdConstituentVnfd,
    NsdPlacementGroups,
    NsdVnfDependency,
    NsdMonitoringParam
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-descriptor");

    @Override
    Class<? extends NsdDescriptor> implementedInterface();

}

