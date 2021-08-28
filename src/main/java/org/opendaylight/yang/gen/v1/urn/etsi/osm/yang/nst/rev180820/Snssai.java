package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * grouping snssai {
 *   leaf slice-service-type {
 *     type network-slice-type;
 *   }
 *   leaf slice-differentiator {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/snssai</i>
 *
 */
public interface Snssai
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("snssai");

    @Override
    Class<? extends Snssai> implementedInterface();
    
    /**
     * Network slice service type 
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSliceType</code> <code>sliceServiceType</code>, or <code>null</code> if not present
     */
    @Nullable NetworkSliceType getSliceServiceType();
    
    /**
     * Network slice differentiator
     *
     *
     *
     * @return <code>java.lang.String</code> <code>sliceDifferentiator</code>, or <code>null</code> if not present
     */
    @Nullable String getSliceDifferentiator();

}

