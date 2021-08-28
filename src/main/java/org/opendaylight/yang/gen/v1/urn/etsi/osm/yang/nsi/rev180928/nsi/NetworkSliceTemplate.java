package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.Nsi$G;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsi</b>
 * <pre>
 * container network-slice-template {
 *   uses nst:network-slice;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsi/nsi/network-slice-template</i>
 * 
 * <p>To create instances of this class use {@link NetworkSliceTemplateBuilder}.
 * @see NetworkSliceTemplateBuilder
 *
 */
public interface NetworkSliceTemplate
    extends
    ChildOf<Nsi$G>,
    Augmentable<NetworkSliceTemplate>,
    NetworkSlice
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("network-slice-template");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi.NetworkSliceTemplate> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi.NetworkSliceTemplate.class;
    }

}

