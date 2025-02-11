// *** WARNING: this file was generated by pulumi-gen-awsx. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Awsx.Ec2.Inputs
{

    /// <summary>
    /// Configuration for a VPC subnet.
    /// </summary>
    public sealed class SubnetSpecArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The bitmask for the subnet's CIDR block.
        /// </summary>
        [Input("cidrMask", required: true)]
        public int CidrMask { get; set; }

        /// <summary>
        /// The subnet's name. Will be templated upon creation.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The type of subnet.
        /// </summary>
        [Input("type", required: true)]
        public Pulumi.Awsx.Ec2.SubnetType Type { get; set; }

        public SubnetSpecArgs()
        {
        }
    }
}
