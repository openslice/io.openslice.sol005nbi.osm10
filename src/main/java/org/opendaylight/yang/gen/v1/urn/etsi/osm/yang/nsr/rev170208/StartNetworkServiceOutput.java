package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import java.lang.Class;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcOutput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * output output {
 *   leaf nsr-id {
 *     type yang:uuid;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/start-network-service/output</i>
 * 
 * <p>To create instances of this class use {@link StartNetworkServiceOutputBuilder}.
 * @see StartNetworkServiceOutputBuilder
 *
 */
public interface StartNetworkServiceOutput
    extends
    RpcOutput,
    Augmentable<StartNetworkServiceOutput>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("output");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.StartNetworkServiceOutput> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.StartNetworkServiceOutput.class;
    }
    
    /**
     * Automatically generated parameter
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>nsrId</code>, or <code>null</code> if not present
     */
    @Nullable Uuid getNsrId();

}

