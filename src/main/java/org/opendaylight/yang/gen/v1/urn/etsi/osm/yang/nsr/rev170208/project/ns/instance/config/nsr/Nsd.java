package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.config.nsr;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdDescriptorCommon;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.config.Nsr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.NsrNsdConstituentVnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.NsrNsdMonitoringParam;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.NsrNsdPlacementGroups;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.NsrNsdVld;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.NsrNsdVnfDependency;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * NS descriptor used to instantiate this NS
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * container nsd {
 *   uses nsd-base:nsd-descriptor-common;
 *   uses project-nsd:nsr-nsd-vld;
 *   uses project-nsd:nsr-nsd-constituent-vnfd;
 *   uses project-nsd:nsr-nsd-placement-groups;
 *   uses project-nsd:nsr-nsd-vnf-dependency;
 *   uses project-nsd:nsr-nsd-monitoring-param;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:etsi:osm:yang:nsr?revision=2017-02-08)ns-instance-config/nsr/nsd</i>
 * 
 * <p>To create instances of this class use {@link NsdBuilder}.
 * @see NsdBuilder
 *
 */
public interface Nsd
    extends
    ChildOf<Nsr>,
    Augmentable<Nsd>,
    NsdDescriptorCommon,
    NsrNsdVld,
    NsrNsdConstituentVnfd,
    NsrNsdPlacementGroups,
    NsrNsdVnfDependency,
    NsrNsdMonitoringParam
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsd");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.config.nsr.Nsd> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.config.nsr.Nsd.class;
    }

}

